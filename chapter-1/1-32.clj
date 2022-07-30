;; Exercise 1.32

(defn accumulator
    [combiner null-value term a next b]
    (if (> a b)
        null-value
        (combiner (term a)
           (accumulator combiner null-value term (next a) next b))))

(defn product
    [term a next b]
    (accumulator * 1 term a next b))

(defn factorial
    [n]
    (product identity 1 inc n))

(defn sum
    [term a next b]
    (accumulator + 0 term a next b))

(defn times-two
    [n]
    (* 2 n))

(defn evens
    [n]
    (sum times-two 0 inc n))