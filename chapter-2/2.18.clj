;; Exercise 2.18
;; Page 140

;; Define a procedure reverse that takes a list
;; as argument and returns a list of the same elements in reverse order:

(defn reverse
    [l]
    (defn inner-reverse
        [l l2]
            (if (empty? l)
                l2
                (inner-reverse (rest l) (cons (first l) l2))))
    (inner-reverse l []))