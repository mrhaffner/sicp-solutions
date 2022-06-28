;; Exercise 1.33a
;; page 82

;; apply a filter to the accumulator function from 1-32
(defn filtered-accumulate
    [filter combiner null-value term a next b]
        (cond 
            (> a b) null-value
            (filter a) 
                (combiner (term a)
                    (filtered-accumulate filter combiner null-value term (next a) next b))
            :else (combiner null-value
                    (filtered-accumulate filter combiner null-value term (next a) next b))))

;; use books implementation of finding a prime number
;; operates in O(log N)
;; faster tests are possible, but we use this due to its simple implementation
(defn smallest-divisor 
    [n] 
    (find-divisor n 2))

(defn find-divisor 
    [n test-divisor]
    (cond 
        (> (square test-divisor) n) n
        (divides? test-divisor n) test-divisor
        :else (recur n (+ test-divisor 1))))

;; modified books implementation so that 1 is not considered prime
;; and to handle negative numbers
(defn prime? 
    [n]
    (and 
        (pos-int? n)
        (not (= n 1)) 
        (= n (smallest-divisor n)))) 

(defn divides? 
    [a b] 
    (= (rem b a) 0))

(defn square
    [a]
    (* a a))

;; caclulate the sum of the square of all prime numbers
;; in the range from a to b inclusive
(defn sum-square-primes
    [a b]
    (filtered-accumulate prime? + 0 square a inc b))