;; Exercise 1.11
;; page 53

;; Recursive implementation
(defn f
  [n]
  (if (< n 3)
    n
    (+ 
      (f (- n 1)) 
      (* 2 (f (- n 2))) 
      (* 3 (f (- n 3))))))

;; Iterative implementation
(defn f
    [n]
    (f-iter 0 1 2 n))

(defn f-iter
    [a b c i]
    (if (<= i 0)
        a
        (recur b c (+ (* 3 a) (* 2 b) c) (dec i))))