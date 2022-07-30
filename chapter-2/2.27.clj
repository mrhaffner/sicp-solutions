;; Exercise 2.27
;; Page 150

(defn deep-reverse
    [l]
    (defn inner-reverse
        [l l2]
            (if (empty? l)
                l2
                (inner-reverse 
                    (rest l) 
                    (cons 
                        (if (sequential? (first l)) 
                            (inner-reverse (first l) [])
                            (first l)) 
                        l2))))
    (inner-reverse l []))

