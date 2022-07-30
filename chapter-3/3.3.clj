;; Exercise 3.2
;; Page 304

(defn make-account 
    [initial-balance new-password]
    (let [balance (atom initial-balance) password new-password]
        (defn withdraw [amount]
            (if (>= @balance amount)
                (swap! balance #(- % amount))
                "Insufficient funds"))
        (defn deposit [amount]
            (swap! balance #(+ % amount)))
        (defn dispatch [input-password m]
            (if (= input-password password)
                (cond 
                    (= m :withdraw) withdraw
                    (= m :deposit) deposit
                    :else (throw (AssertionError. 
                            (str "Unknown request: MAKE-ACCOUNT " m))))
                (throw (AssertionError. 
                            (str "Incorrect password")))))
        dispatch))

(def a (make-account 10 :1234))

((a :1234 :withdraw) 1)

((a :123 :withdraw) 1)
